# rest-assured-authentication
This project shows how to do login authentication with restAssured for Web Services Testing.

## Sample Test Application
I have used https://github.com/jmeterbyexample/digital-toys-web-application project for doing testing the authentication mechanism via restAssured.

Clone this sample application somewhere in your machine and follow below instructions to run web application.

## Starting Web Application
###Windows
```
C:\> set SESSION_IN_URL=true
C:\> startDt.bat
2016-12-02 22:02:37.384:INFO::main: Logging initialized @445ms
2016-12-02 22:02:37.405:INFO:oejr.Runner:main: Runner
2016-12-02 22:02:37.755:INFO:oejs.Server:main: jetty-9.3.7.v20160115
2016-12-02 22:02:53.593:INFO:/:main: No Spring WebApplicationInitializer types detected on classpath
SESSION_IN_URL specified in environment - enabling session in URL if cookies are not enabled.
2016-12-02 22:02:55.096:INFO:/:main: Initializing Spring root WebApplicationContext
SESSION_IN_URL specified in environment - enabling session in URL if cookies are not enabled.
Populating products
2016-12-02 22:03:16.034:INFO:/:main: Initializing Spring FrameworkServlet 'grails'
2016-12-02 22:03:17.265:INFO:oejsh.ContextHandler:main: Started o.e.j.w.WebAppContext@707f7052{/,file:///C:/Users/msys/A
ppData/Local/Temp/jetty-0.0.0.0-8080-dt-1.0.war-_-any-1135464954042676645.dir/webapp/,AVAILABLE}{..}
2016-12-02 22:03:17.337:INFO:oejs.ServerConnector:main: Started ServerConnector@1af6974c{HTTP/1.1,[http/1.1]}{0.0.0.0:80
80}
2016-12-02 22:03:17.339:INFO:oejs.Server:main: Started @40405ms
```

###Linux/MacOS
```
$ export SESSION_IN_URL=true
$ startDt.sh
2016-12-02 22:06:40.069:INFO::main: Logging initialized @406ms
2016-12-02 22:06:40.088:INFO:oejr.Runner:main: Runner
2016-12-02 22:06:40.388:INFO:oejs.Server:main: jetty-9.3.7.v20160115
2016-12-02 22:06:56.158:INFO:/:main: No Spring WebApplicationInitializer types detected on classpath
SESSION_IN_URL specified in environment - enabling session in URL if cookies are not enabled.
2016-12-02 22:06:57.409:INFO:/:main: Initializing Spring root WebApplicationContext
SESSION_IN_URL specified in environment - enabling session in URL if cookies are not enabled.
Populating products
2016-12-02 22:07:16.593:INFO:/:main: Initializing Spring FrameworkServlet 'grails'
2016-12-02 22:07:17.674:INFO:oejsh.ContextHandler:main: Started o.e.j.w.WebAppContext@707f7052{/,file:///C:/cygwin64/tmp/jetty-0.0.0.0-8080-dt-1.0.war-_-any-7531697417074887308.dir/webapp/,AVAILABLE}{..}
2016-12-02 22:07:17.730:INFO:oejs.ServerConnector:main: Started ServerConnector@6d035815{HTTP/1.1,[http/1.1]}{0.0.0.0:8080}
2016-12-02 22:07:17.731:INFO:oejs.Server:main: Started @38071ms
```

## Login to Digital Toys Web Application
```
username: user1@dt.com
login: user1
```

## Running Test
After starting web application, come back to this project and execute:
```
mvn clean test
```

You will see that JSESSIONID will be printed on console. You can use this JSESSION ID and hit further REST APIs which required authentication.

