/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.eric.swig;

public class CallbackStub {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CallbackStub(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CallbackStub obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        HarryJNI.delete_CallbackStub(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  protected void swigDirectorDisconnect() {
    swigCMemOwn = false;
    delete();
  }

  public void swigReleaseOwnership() {
    swigCMemOwn = false;
    HarryJNI.CallbackStub_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    HarryJNI.CallbackStub_change_ownership(this, swigCPtr, true);
  }

  public void on_void_method() {
    if (getClass() == CallbackStub.class) HarryJNI.CallbackStub_on_void_method(swigCPtr, this); else HarryJNI.CallbackStub_on_void_methodSwigExplicitCallbackStub(swigCPtr, this);
  }

  public String on_string_method(String msg) {
    return (getClass() == CallbackStub.class) ? HarryJNI.CallbackStub_on_string_method(swigCPtr, this, msg) : HarryJNI.CallbackStub_on_string_methodSwigExplicitCallbackStub(swigCPtr, this, msg);
  }

  public SWIGTYPE_p_signed_char on_byte_array_method(SWIGTYPE_p_signed_char arr) {
    long cPtr = (getClass() == CallbackStub.class) ? HarryJNI.CallbackStub_on_byte_array_method(swigCPtr, this, SWIGTYPE_p_signed_char.getCPtr(arr)) : HarryJNI.CallbackStub_on_byte_array_methodSwigExplicitCallbackStub(swigCPtr, this, SWIGTYPE_p_signed_char.getCPtr(arr));
    return (cPtr == 0) ? null : new SWIGTYPE_p_signed_char(cPtr, false);
  }

  public CallbackStub() {
    this(HarryJNI.new_CallbackStub(), true);
    HarryJNI.CallbackStub_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

}