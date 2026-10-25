package com.example.tenantmanagementsystem

// "object" means exactly ONE copy exists for the whole app,
// so every screen sees the same list of tenants
object TenantRepository {

    val tenants = mutableListOf<Tenant>()

    fun addTenant(tenant: Tenant) {
        tenants.add(tenant)
    }

    // Converts each rent from text to a number and adds them up.
    // If a rent isn't a valid number, it counts as 0.0 instead of crashing
    fun totalRent(): Double {
        return tenants.sumOf { it.rent.toDoubleOrNull() ?: 0.0 }
    }
}