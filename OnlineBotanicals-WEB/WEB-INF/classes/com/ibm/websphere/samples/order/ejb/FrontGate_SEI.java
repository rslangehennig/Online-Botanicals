/**
 * FrontGate_SEI.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf070942.33 v102309233842
 */

package com.ibm.websphere.samples.order.ejb;

public interface FrontGate_SEI extends java.rmi.Remote {
    public void updateOrderStatus(java.lang.String orderID, java.lang.String orderStatus) throws java.rmi.RemoteException;
    public java.lang.String sendOrder(java.lang.String uid, java.lang.String orderID, java.lang.String item, int quantity) throws java.rmi.RemoteException;
    public void updateItemStatus(java.lang.String orderID, java.lang.String item, java.lang.String status) throws java.rmi.RemoteException;
    public boolean checkOrderStatus(java.lang.String orderID) throws java.rmi.RemoteException;
}
