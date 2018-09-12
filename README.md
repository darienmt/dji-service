# DJI Mobile Service SDK on an Android Things application

# Overview

The intent of this project is to explore how the DJI Mobile SDK could work on an Android Things environment running on a Raspberry Pi 3 B.
This is completely experimental to find a way to command a DJI drone supported the Mobile SDK. Let's see how it goes.
More description of that the application could do will be provided as it is implemented/explored.

# DJI Dev key

In order to run this project you need to register as a DJI developer and register your own application to get the API Key.
The API Key should be set on the global `~/.gladle/gradle.properties`. Here is an example of this file:
```
> cat ~/.gradle/gradle.properties
DJI_API_KEY={THE_KEY}
```

This is one way to inject the meta-data needed to register the application with DJI without putting your key on a public repo. If you know a better approach, let me know.
 
