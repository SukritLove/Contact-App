package contacts.presentation.component

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import contacts.domain.Contact
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalResourceApi::class)
@Composable
fun ContactListItem(
    contact: Contact,
    modifier: Modifier = Modifier
) {

    Row(
        modifier = modifier, verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painterResource("Contact-App.png"),
            null,
            modifier = Modifier.size(50.dp).clip(RoundedCornerShape(35))
        )

        Spacer((Modifier.width(16.dp)))

        Text(text = "${contact.firstName} ${contact.lastName}", modifier = Modifier.weight(1f))
    }
}