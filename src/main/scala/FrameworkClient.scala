import org.apache.mesos.MesosSchedulerDriver
import org.apache.mesos.Protos.FrameworkInfo

/**
 * Client program which will launch shell commands on cluster
 * Read README.md for example invocation.
 */
object FrameworkClient {

  def main(args: Array[String]) {

    val framework = FrameworkInfo.newBuilder.
    setName("DistributedShell").
    setUser("").
    setRole("*").
    setCheckpoint(false).
    setFailoverTimeout(0.0d).
    build()

    //create instance of schedule and connect to mesos
    val scheduler = new TestScheduler
    //submit shell commands
    scheduler.submitTasks(args:_*)
    val mesosURL = "10.3.2.2:5050"
    val driver = new MesosSchedulerDriver(scheduler,framework,mesosURL)
    //run the driver
    driver.run()
  }
}

