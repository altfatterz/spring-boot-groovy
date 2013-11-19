@Grab("spring-boot-starter-actuator")
@Grab("spring-boot-starter-security")
@Grab("spring-boot-starter-shell-remote")
@RestController
class GreetingController {

	@RequestMapping("/greet/{name}")
	Object hi(@PathVariable String name) {
		[ greeting : "Hi " + name]
	}

}