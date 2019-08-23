/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.MethodDescriptor;
import java.beans.PropertyDescriptor;

/**
 *
 * @author c3
 */
public class MyEmployee {
    public static void main(String[] args) throws ClassNotFoundException, IntrospectionException {
        BeanInfo be=Introspector.getBeanInfo(Employee.class);
        PropertyDescriptor[] propertyDescriptors = be.getPropertyDescriptors();
        MethodDescriptor[] methodDescriptors=be.getMethodDescriptors();
        
        System.out.println("\nProperties:");
        for(PropertyDescriptor pd:propertyDescriptors)
        {   
            System.out.println("\t"+pd.getName());
        }
        System.out.println("\nMethods:");
        for(MethodDescriptor md:methodDescriptors)
        {   
            System.out.println("\t"+md.getName());
        }       
    }
}
