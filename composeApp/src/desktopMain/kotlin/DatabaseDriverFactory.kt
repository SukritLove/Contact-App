import app.cash.sqldelight.driver.jdbc.sqlite.JdbcSqliteDriver

import app.cash.sqldelight.db.SqlDriver
import org.example.sqldelight.database.ContactDatabase

actual class DatabaseDriverFactory {
    actual fun create(): SqlDriver {
        val driver: SqlDriver = JdbcSqliteDriver(JdbcSqliteDriver.IN_MEMORY)
        ContactDatabase.Schema.create(driver)
        return driver
    }
}