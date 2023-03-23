module jade {
    exports jade;
    exports jade.content;
    exports jade.content.lang;
    exports jade.content.lang.sl;
    exports jade.content.onto.basic;
    exports jade.core;
    exports jade.core.behaviours;
    exports jade.core.messaging;
    exports jade.gui;
    exports jade.proto;
    exports jade.lang.acl;
    exports jade.domain;
    exports jade.domain.FIPAAgentManagement;
    exports jade.domain.introspection;
    exports jade.domain.JADEAgentManagement;
    exports jade.util;
    exports jade.util.leap;
    exports jade.wrapper;
    exports jade.wrapper.gateway;

    requires java.desktop;
    requires java.logging;
    requires org.apache.commons.codec;
    requires java.rmi;
    requires java.sql;
    requires glassfish.corba.omgapi;
    requires java.management;
}
