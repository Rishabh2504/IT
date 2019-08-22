/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;

/**
 *
 * @author c3
 */
public class MyStudent {
    
    public static void main(String[] args) throws ClassNotFoundException, IntrospectionException {
        Class pd=Class.forName("Beans.Student.class");
        BeanInfo be=Introspector.getBeanInfo(pd);
        PropertyDescriptor[] propertyDescriptors = be.getPropertyDescriptors();
        
    }
    
}
