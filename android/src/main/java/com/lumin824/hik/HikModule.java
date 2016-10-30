package com.lumin824.hik;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;


public class HikModule extends ReactContextBaseJavaModule {

  public HikModule(ReactApplicationContext reactContext) {
    super(reactContext);
  }

  @Override
  public String getName(){
    return "HikModule";
  }

  @ReactMethod
  public void test(Promise promise){
    promise.resolve("ok");
  }
}
