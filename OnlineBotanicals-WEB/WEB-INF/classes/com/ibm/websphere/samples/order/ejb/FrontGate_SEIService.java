/**
 * FrontGate_SEIService.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf070942.33 v102309233842
 */

package com.ibm.websphere.samples.order.ejb;

public interface FrontGate_SEIService extends javax.xml.rpc.Service {
    public com.ibm.websphere.samples.order.ejb.FrontGate_SEI getFrontGate() throws javax.xml.rpc.ServiceException;

    public java.lang.String getFrontGateAddress();

    public com.ibm.websphere.samples.order.ejb.FrontGate_SEI getFrontGate(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
