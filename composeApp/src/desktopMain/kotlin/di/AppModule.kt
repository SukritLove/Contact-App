package di

import DatabaseDriverFactory
import contacts.data.SqlDelightContactDataSource
import contacts.domain.ContactDataSource
import org.example.sqldelight.database.ContactDatabase


actual class AppModule {
    actual val contactDataSource: ContactDataSource by lazy {
        SqlDelightContactDataSource(
            db = ContactDatabase(driver = DatabaseDriverFactory().create())
        )
    }
}