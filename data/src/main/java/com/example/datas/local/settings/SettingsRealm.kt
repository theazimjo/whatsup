package com.example.datas.local.settings

import io.realm.kotlin.types.ObjectId
import io.realm.kotlin.types.RealmObject
import io.realm.kotlin.types.annotations.PrimaryKey

data class SettingsRealm(
    @PrimaryKey
    val id: ObjectId = ObjectId.create(),
    val onboarded: Boolean = false
) : RealmObject {
}