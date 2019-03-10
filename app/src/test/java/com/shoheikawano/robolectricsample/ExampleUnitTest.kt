package com.shoheikawano.robolectricsample

import androidx.test.core.app.ActivityScenario
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.shoheikawano.robolectricsample.testsupport.TestActivity
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class ExampleUnitTest {

    /*
        Running test with following command: ./gradlew app:testDebugUnitTest
        results in test failure with with the following stacktrace:
        java.lang.NullPointerException
            at org.robolectric.android.internal.LocalActivityInvoker.startActivity(LocalActivityInvoker.java:36)
            at androidx.test.core.app.ActivityScenario.launch(ActivityScenario.java:207)
            at androidx.test.core.app.ActivityScenario.launch(ActivityScenario.java:184)
            at com.shoheikawano.robolectricsample.ExampleUnitTest.addition_isCorrect(ExampleUnitTest.kt:13)
            at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
            at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
            at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
            at java.lang.reflect.Method.invoke(Method.java:498)
            at org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:50)
            at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12)
            at org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:47)
            at org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMethod.java:17)
            at org.robolectric.internal.SandboxTestRunner$2.lambda$evaluate$0(SandboxTestRunner.java:256)
            at org.robolectric.internal.bytecode.Sandbox.lambda$runOnMainThread$0(Sandbox.java:89)
            at java.util.concurrent.FutureTask.run(FutureTask.java:266)
            at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142)
            at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617)
            at java.lang.Thread.run(Thread.java:745)
     */
    @Test
    fun addition_isCorrect() {
        ActivityScenario.launch(TestActivity::class.java).onActivity {
            assertEquals(4, 2 + 2)
        }
    }
}
