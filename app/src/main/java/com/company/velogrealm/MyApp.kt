package com.company.velogrealm

import android.app.Application
import com.company.velogrealm.models.Address
import com.company.velogrealm.models.Course
import com.company.velogrealm.models.Student
import com.company.velogrealm.models.Teacher

import io.realm.kotlin.Realm
import io.realm.kotlin.RealmConfiguration

class MyApp: Application() {
    companion object {
        lateinit var realm: Realm
    }
    override fun onCreate() {
        super.onCreate()

        realm = Realm.open(
            configuration = RealmConfiguration.create(
                schema = setOf(
                    Address::class,
                    Teacher::class,
                    Course::class,
                    Student::class,
                )
            )
        )

    }
}