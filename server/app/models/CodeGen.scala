package models

object CodeGen extends App {
  slick.codegen.SourceCodeGenerator.run(
    "slick.jbdc.PostgresProfile",
    "org.postgresql.Driver",
    "jbdc:postgresql://localhost/database?user=gchollet&password=gchollet",
    "C:/Users/garre/OneDrive/Documents/CS/School/Junior Year/Web Apps/in-class-code-Gchollett/server/app",
    "models", None, None, true, false
  )
}
