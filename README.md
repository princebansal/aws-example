# aws-example
12-10 00:24:43.024 19919-19919/? I/art: Late-enabling -Xcheck:jni
12-10 00:24:43.089 19919-19919/com.example.dell.awsexample W/System: ClassLoader referenced unknown path: /data/app/com.example.dell.awsexample-2/lib/arm
12-10 00:24:43.093 19919-19919/com.example.dell.awsexample I/LoadedApk: No resource references to update in package com.materialos.cm.theme
12-10 00:24:43.100 19919-19919/com.example.dell.awsexample D/AndroidRuntime: Shutting down VM
12-10 00:24:43.102 19919-19919/com.example.dell.awsexample E/AndroidRuntime: FATAL EXCEPTION: main
                                                                             Process: com.example.dell.awsexample, PID: 19919
                                                                             Theme: themes:{default=overlay:com.materialos.cm.theme, iconPack:com.materialos.cm.theme, fontPkg:system, com.android.systemui=overlay:com.cyngn.hexo, com.android.systemui.navbar=overlay:com.materialos.cm.theme}
                                                                             java.lang.RuntimeException: Unable to instantiate activity ComponentInfo{com.example.dell.awsexample/com.example.dell.awsexample.MainActivity}: java.lang.NullPointerException: Attempt to invoke virtual method 'android.view.Window$Callback android.view.Window.getCallback()' on a null object reference
                                                                                 at android.app.ActivityThread.performLaunchActivity(ActivityThread.java:2361)
                                                                                 at android.app.ActivityThread.handleLaunchActivity(ActivityThread.java:2510)
                                                                                 at android.app.ActivityThread.-wrap11(ActivityThread.java)
                                                                                 at android.app.ActivityThread$H.handleMessage(ActivityThread.java:1363)
                                                                                 at android.os.Handler.dispatchMessage(Handler.java:102)
                                                                                 at android.os.Looper.loop(Looper.java:148)
                                                                                 at android.app.ActivityThread.main(ActivityThread.java:5461)
                                                                                 at java.lang.reflect.Method.invoke(Native Method)
                                                                                 at com.android.internal.os.ZygoteInit$MethodAndArgsCaller.run(ZygoteInit.java:726)
                                                                                 at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:616)
                                                                              Caused by: java.lang.NullPointerException: Attempt to invoke virtual method 'android.view.Window$Callback android.view.Window.getCallback()' on a null object reference
                                                                                 at android.support.v7.app.AppCompatDelegateImplBase.<init>(AppCompatDelegateImplBase.java:116)
                                                                                 at android.support.v7.app.AppCompatDelegateImplV9.<init>(AppCompatDelegateImplV9.java:147)
                                                                                 at android.support.v7.app.AppCompatDelegateImplV11.<init>(AppCompatDelegateImplV11.java:27)
                                                                                 at android.support.v7.app.AppCompatDelegateImplV14.<init>(AppCompatDelegateImplV14.java:53)
                                                                                 at android.support.v7.app.AppCompatDelegateImplV23.<init>(AppCompatDelegateImplV23.java:29)
                                                                                 at android.support.v7.app.AppCompatDelegate.create(AppCompatDelegate.java:203)
                                                                                 at android.support.v7.app.AppCompatDelegate.create(AppCompatDelegate.java:185)
                                                                                 at android.support.v7.app.AppCompatActivity.getDelegate(AppCompatActivity.java:525)
                                                                                 at android.support.v7.app.AppCompatActivity.findViewById(AppCompatActivity.java:193)
                                                                                 at com.example.dell.awsexample.MainActivity.<init>(MainActivity.java:40)
                                                                                 at java.lang.Class.newInstance(Native Method)
                                                                                 at android.app.Instrumentation.newActivity(Instrumentation.java:1068)
                                                                                 at android.app.ActivityThread.performLaunchActivity(ActivityThread.java:2351)
                                                                                 at android.app.ActivityThread.handleLaunchActivity(ActivityThread.java:2510) 
                                                                                 at android.app.ActivityThread.-wrap11(ActivityThread.java) 
                                                                                 at android.app.ActivityThread$H.handleMessage(ActivityThread.java:1363) 
                                                                                 at android.os.Handler.dispatchMessage(Handler.java:102) 
                                                                                 at android.os.Looper.loop(Looper.java:148) 
                                                                                 at android.app.ActivityThread.main(ActivityThread.java:5461) 
                                                                                 at java.lang.reflect.Method.invoke(Native Method) 
                                                                                 at com.android.internal.os.ZygoteInit$MethodAndArgsCaller.run(ZygoteInit.java:726) 
                                                                                 at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:616) 
12-10 00:24:44.499 19919-19919/? I/Process: Sending signal. PID: 19919 SIG: 9
