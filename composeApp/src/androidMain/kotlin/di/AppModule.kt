package di

import DatabaseDriverFactory
import android.content.Context
import contacts.data.SqlDelightContactDataSource
import contacts.domain.ContactDataSource
import org.example.sqldelight.database.ContactDatabase

actual class AppModule(
    private val context: Context
) {
    actual val contactDataSource: ContactDataSource by lazy {
        SqlDelightContactDataSource(
            db = ContactDatabase(driver = DatabaseDriverFactory(context).create())
        )
    }
}