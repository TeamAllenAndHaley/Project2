package com.allenhaley.config;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateConfigUtil {
    private static StandardServiceRegistry registry;
    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory(){
        if(sessionFactory == null){
           try{
               //create session factory

               //registry
               registry = new StandardServiceRegistryBuilder()
                       .configure()
                       .build();

               //Create the metadata
               MetadataSources sources = new MetadataSources(registry);

               Metadata metadata = sources.getMetadataBuilder().build();

               //create the factory
               sessionFactory = metadata.getSessionFactoryBuilder().build();
           } catch(Exception e) {
               e.printStackTrace();
               shutdown();
           }
        }
        return sessionFactory;
    }

    public static void shutdown(){
        if(registry != null){
            StandardServiceRegistryBuilder.destroy(registry);
        }
    }
}
