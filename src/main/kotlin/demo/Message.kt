package demo

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

//@Table("MESSAGES")
//data class Message(@Id val id: String?, val text: String)

@Table("MESSAGES")
data class Message(val text: String, @Id val id: String? = null)