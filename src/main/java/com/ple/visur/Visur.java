package com.ple.visur;

import io.vertx.rxjava3.core.Vertx;
import io.vertx.core.VertxOptions;

public class Visur {

    public static void main(final String[] args) {
      final Visur visur = new Visur();
    }

    private final Vertx vertx;
    private final boolean debug = true;

    Visur() {

      final VertxOptions options = new VertxOptions();
      if(debug) {
        options.setBlockedThreadCheckInterval(Long.MAX_VALUE >> 2);
      }

      vertx = Vertx.vertx(options);
//      vertx.deployVerticle(new HttpServerVerticle());
    }


}
