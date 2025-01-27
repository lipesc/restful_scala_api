package models

import slick.jdbc.PostgresProfile.api._
import java.time.LocalDateTime



case class Task (
  id: Option[Long],
  user_id: Long,
  title: String,
  description: Option[String],
  status: String,
  priority: String,
  due_date: Option[LocalDateTime]
) 

// class TaskTable(tag: Tag) extends Table[Task](tag, "tasks") {
//   def id = column[Long]("id", O.PrimaryKey, O.AutoInc)
//   def
// }
