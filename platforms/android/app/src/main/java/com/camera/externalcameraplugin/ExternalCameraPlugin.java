package com.camera.externalcameraplugin;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;

import android.content.Context;
import android.content.Intent;
/**
 * This class echoes a string called from JavaScript.
 */
public class ExternalCameraPlugin extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("start")) {
            Context context = cordova.getActivity().getApplicationContext();
            this.start(context);
            return true;
        }
        return false;
    }

    private void start(Context context) {
        Intent intent = new Intent(context, ExternalCameraActivity.class);
        this.cordova.getActivity().startActivity(intent);
    }
}
