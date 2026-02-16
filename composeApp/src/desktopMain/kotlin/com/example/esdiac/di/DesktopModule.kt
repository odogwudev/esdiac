package com.example.esdiac.di

import com.example.esdiac.ApplicationStateHolder
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val desktopModule = module {  
    singleOf(::ApplicationStateHolder)
}