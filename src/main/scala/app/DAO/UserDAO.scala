package DAO

import scala.concurrent.ExecutionContext
import slick.jdbc.PostgresProfile.api._
import models.UserTable
import scala.concurrent.Future
import models.User

class UserDAO(db: Database)(implicit ec: ExecutionContext) {
  private  val users = TableQuery[UserTable]



def createUser(user: User): Future[Long] =
  db.run((users returning users.map(_.id)) += user)


def findUserID(id: Long): Future[Option[User]] = 
  db.run(users.filter(_.id === id).result.headOption)


def findUserName(username: String): Future[Option[User]] =
  db.run(users.filter(_.username === username).result.headOption)




} 
