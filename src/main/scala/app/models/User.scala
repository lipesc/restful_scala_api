package models
import slick.jdbc.PostgresProfile.api._
import java.time.LocalDateTime

case class User(id: Option[Long], username: String, email: String, passwordHash: String)

class UserTable(tag: Tag,) extends Table[User](tag, "users") {
  
  def id = column[Long]("id", O.PrimaryKey, O.AutoInc)
  def username = column[String]("username", O.Unique)
  def email = column[String]("email", O.Unique)
  def passwordHash = column[String]("password_hash")

  def * = (id.?, username, email, passwordHash) <> (User.Tupled, User.unapply)
}

