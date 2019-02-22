package com.desafio.desafioweb.entity;

import com.desafio.desafioweb.entity.Fabricante;
import com.desafio.desafioweb.entity.Funcionalidade;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-02-19T21:09:38")
@StaticMetamodel(Modelo.class)
public class Modelo_ { 

    public static volatile SingularAttribute<Modelo, Float> tela;
    public static volatile SingularAttribute<Modelo, Funcionalidade> funcionalidade;
    public static volatile SingularAttribute<Modelo, String> nome;
    public static volatile SingularAttribute<Modelo, Long> id;
    public static volatile SingularAttribute<Modelo, Fabricante> fabricante;
    public static volatile SingularAttribute<Modelo, String> flash;
    public static volatile SingularAttribute<Modelo, String> url;

}