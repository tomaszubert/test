package com.app;

import com.app.dao.PersonDao;
import com.app.dao.PersonDaoImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        PersonDao personDao = new PersonDaoImpl();
    }
}
