package com.ryosms.helloworld.controller

import gitbucket.core.controller.ControllerBase

/**
  * Created by ryosms on 2016/08/13.
  */
class HelloWorldController extends ControllerBase {
  get("/helloworld") {
    "Hello GitBucket Plugin!"
  }
}
