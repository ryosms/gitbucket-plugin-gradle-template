import com.ryosms.helloworld.controller.HelloWorldController
import io.github.gitbucket.solidbase.model.Version

/**
  * Created by ryosms on 2016/08/13.
  */
class Plugin extends gitbucket.core.plugin.Plugin {
  override val pluginId: String = "helloworld"
  override val pluginName: String = "HelloWorld Plugin"
  override val description: String = "First Example of GitBucket plug-in"
  override val versions: Seq[Version] = List(new Version("1.0.0"))

  override val controllers = Seq(
    "/helloworld" -> new HelloWorldController()
  )
}
