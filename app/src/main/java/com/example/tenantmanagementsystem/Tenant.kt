package com.example.tenantmanagementsystem

import java.io.Serializable

// ": Serializable" allows a Tenant object to be packed up and sent to another screen via Safe Args
data class Tenant(
    val name: String,
    val phone: String,
    val rent: String
) : Serializable {
    // Unchanged: the text shown by @{tenant.summary()}
    fun summary(): String {
        return "Tenant: $name\nPhone: $phone\nRent: KSh $rent"
    }
}