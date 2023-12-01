package contacts.data

import contacts.domain.Contact
import org.example.sqldelight.database.ContactEntity

fun ContactEntity.toContact(): Contact {
    return Contact(
        id = id,
        firstName = firstName,
        lastName = lastName,
        email = email,
        phoneNumber = phoneNumber
    )
}