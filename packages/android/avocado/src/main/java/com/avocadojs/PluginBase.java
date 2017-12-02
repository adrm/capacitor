package com.avocadojs;

import android.util.Log;


public class PluginBase {
  private String pluginId;
  public Avocado avocado;

  public PluginBase(Avocado avocado, String id) {
    Log.d("PLUGIN", id);

    this.avocado = avocado;
    this.pluginId = id;
  }

  public String getId() {
    return this.pluginId;
  }

}