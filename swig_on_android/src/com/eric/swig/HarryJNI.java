/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.eric.swig;

public class HarryJNI {
  public final static native void delete_CallbackStub(long jarg1);
  public final static native void CallbackStub_on_void_method(long jarg1, CallbackStub jarg1_);
  public final static native void CallbackStub_on_void_methodSwigExplicitCallbackStub(long jarg1, CallbackStub jarg1_);
  public final static native String CallbackStub_on_string_method(long jarg1, CallbackStub jarg1_, String jarg2);
  public final static native String CallbackStub_on_string_methodSwigExplicitCallbackStub(long jarg1, CallbackStub jarg1_, String jarg2);
  public final static native long CallbackStub_on_byte_array_method(long jarg1, CallbackStub jarg1_, long jarg2);
  public final static native long CallbackStub_on_byte_array_methodSwigExplicitCallbackStub(long jarg1, CallbackStub jarg1_, long jarg2);
  public final static native long new_CallbackStub();
  public final static native void CallbackStub_director_connect(CallbackStub obj, long cptr, boolean mem_own, boolean weak_global);
  public final static native void CallbackStub_change_ownership(CallbackStub obj, long cptr, boolean take_or_release);
  public final static native void init(long jarg1, CallbackStub jarg1_);
  public final static native void void_method();
  public final static native String string_method(String jarg1);
  public final static native long byte_array_method(long jarg1);
  public final static native int NET_UDP_get();
  public final static native int NET_TCP_get();
  public final static native void DefStruct_value_int_set(long jarg1, DefStruct jarg1_, int jarg2);
  public final static native int DefStruct_value_int_get(long jarg1, DefStruct jarg1_);
  public final static native void DefStruct_net_set(long jarg1, DefStruct jarg1_, int jarg2);
  public final static native int DefStruct_net_get(long jarg1, DefStruct jarg1_);
  public final static native long new_DefStruct();
  public final static native void delete_DefStruct(long jarg1);
  public final static native long new_DefClass();
  public final static native void DefClass_value_int_set(long jarg1, DefClass jarg1_, int jarg2);
  public final static native int DefClass_value_int_get(long jarg1, DefClass jarg1_);
  public final static native void delete_DefClass(long jarg1);

  public static void SwigDirector_CallbackStub_on_void_method(CallbackStub self) {
    self.on_void_method();
  }
  public static String SwigDirector_CallbackStub_on_string_method(CallbackStub self, String msg) {
    return self.on_string_method(msg);
  }
  public static long SwigDirector_CallbackStub_on_byte_array_method(CallbackStub self, long arr) {
    return SWIGTYPE_p_signed_char.getCPtr(self.on_byte_array_method((arr == 0) ? null : new SWIGTYPE_p_signed_char(arr, false)));
  }

  private final static native void swig_module_init();
  static {
    swig_module_init();
  }
}