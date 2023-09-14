package com.dnb.DevConnector.utils;

import java.util.Properties;

import org.hibernate.HibernateException;
import org.hibernate.MappingException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.enhanced.SequenceStyleGenerator;
import org.hibernate.internal.util.config.ConfigurationHelper;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.type.Type;
import org.hibernate.type.spi.TypeConfiguration;

public class CustomIdGenerator extends SequenceStyleGenerator {
	
	public static final String VALUE_PREFIX_PARAMETER="valuePrefix";
	public static final String VALUE_PREFIX_DEFAULT="%tY-%tM";
	private String valuePrefix;
	
	public static final String DATE_FORMAT_PARAMETER="dateFormat";
	public static final String DATE_FORMAT_DEFAULT="";
	private String dateFormat;
	
    public static final String DATE_NUMBER_SEPARATOR_PARAMETER = "dateNumberSeparator";
    public static final String DATE_NUMBER_SEPARATOR_DEFAULT = "_";
    private String dateNumberSeparator;
	
	public static final String BOOL_FORMAT_PARAMETER="flag";
	public static final boolean BOOL_FORMAT_DEFAULT=false;
	private boolean flag;

	
	public static final String NUMBER_FORMAT_PARAMETER="numberFormat";
	public static final String NUMBER_FORMAT_DEFAULT="%d";
	private String numberFormat;
	
	
	
	
	@Override
	public Object generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
		// TODO Auto-generated method stub
		//return super.generate(session, object);
		if(flag==true) {
			return valuePrefix+ String.format(numberFormat,super.generate(session, object) );
		}
		else
		return valuePrefix+String.format(dateFormat, super.generate(session, object)) +dateNumberSeparator+ String.format(numberFormat,super.generate(session, object) );
	}
	
	@Override
	public void configure(Type type, Properties parameters, ServiceRegistry serviceRegistry) throws MappingException {
		// TODO Auto-generated method stub
		super.configure(new TypeConfiguration().getBasicTypeRegistry().getRegisteredType(Long.class), parameters, serviceRegistry);
		flag = ConfigurationHelper.getBoolean(BOOL_FORMAT_PARAMETER, parameters,BOOL_FORMAT_DEFAULT);

		if(flag) {
			valuePrefix = ConfigurationHelper.getString(VALUE_PREFIX_PARAMETER, parameters, VALUE_PREFIX_DEFAULT);
			numberFormat = ConfigurationHelper.getString(NUMBER_FORMAT_PARAMETER, parameters,NUMBER_FORMAT_DEFAULT);
			
		}
		else {
		valuePrefix = ConfigurationHelper.getString(VALUE_PREFIX_PARAMETER, parameters, VALUE_PREFIX_DEFAULT);
		dateFormat = ConfigurationHelper.getString(DATE_FORMAT_PARAMETER, parameters,DATE_FORMAT_DEFAULT).replace("%", "%1");
		dateNumberSeparator = ConfigurationHelper.getString(DATE_NUMBER_SEPARATOR_PARAMETER, parameters,DATE_NUMBER_SEPARATOR_DEFAULT);
		numberFormat = ConfigurationHelper.getString(NUMBER_FORMAT_PARAMETER, parameters,NUMBER_FORMAT_DEFAULT);//.replace("%", "");
		}

		
	}

}

