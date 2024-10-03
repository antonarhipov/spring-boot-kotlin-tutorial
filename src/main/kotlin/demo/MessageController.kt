package demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/")
class MessageController {
   @GetMapping
   fun listMessages() = listOf(
      Message("1", "Hello!"),
      Message("2", "Bonjour!"),
      Message("3", "Privet!"),
   )
}