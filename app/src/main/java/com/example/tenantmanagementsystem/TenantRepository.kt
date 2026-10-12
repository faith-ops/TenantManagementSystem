package com.example.tenantmanagementsystem

object TenantRepository {
    // A shared list of tenants accessible across all fragments
    val tenants = mutableListOf<Tenant>()

    fun addTenant(tenant: Tenant) {
        tenants.add(tenant)
    }

    fun totalRent(): Double {
        return tenants.sumOf { it.rent.toDoubleOrNull() ?: 0.0 }
    }
}