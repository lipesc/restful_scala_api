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

class TaskTable(tag: Tag) extends Table[Task](tag, "tasks") {
  def id = column[Long]("id", O.PrimaryKey, O.AutoInc)
  def user_id = column[Long]("user_id")
  def title = column[String]("title")
  def description = column[Option[String]]("description")
  def status = column[String]("status", O.Default("Pending"))
  def priority = column[String]("priority", O.Default("Low"))
  def due_date = column[Option[LocalDateTime]]("due_date")

  def FK = foreignKey("user_fk", user_id, TableQuery[UserTable])(_.id, onDelete = ForeignKeyAction.Cascade) 

  def * = (id.?, user_id, title, description, status, priority, due_date) <> (Task.tupled, Task.unapply)

}
