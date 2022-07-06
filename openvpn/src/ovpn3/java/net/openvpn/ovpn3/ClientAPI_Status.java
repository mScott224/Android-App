/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.openvpn.ovpn3;

public class ClientAPI_Status {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected ClientAPI_Status(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ClientAPI_Status obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ovpncliJNI.delete_ClientAPI_Status(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setError(boolean value) {
    ovpncliJNI.ClientAPI_Status_error_set(swigCPtr, this, value);
  }

  public boolean getError() {
    return ovpncliJNI.ClientAPI_Status_error_get(swigCPtr, this);
  }

  public void setStatus(String value) {
    ovpncliJNI.ClientAPI_Status_status_set(swigCPtr, this, value);
  }

  public String getStatus() {
    return ovpncliJNI.ClientAPI_Status_status_get(swigCPtr, this);
  }

  public void setMessage(String value) {
    ovpncliJNI.ClientAPI_Status_message_set(swigCPtr, this, value);
  }

  public String getMessage() {
    return ovpncliJNI.ClientAPI_Status_message_get(swigCPtr, this);
  }

  public ClientAPI_Status() {
    this(ovpncliJNI.new_ClientAPI_Status(), true);
  }

}
