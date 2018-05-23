package co.uk.random.di

import co.uk.mlkit.MLKitActivity
import co.uk.random.di.module.HomeActivityModule
import co.uk.random.di.module.MLKitActivityModule
import co.uk.random.di.module.ReceiptsActivityModule
import co.uk.random.view.home.HomeActivity
import co.uk.spltech.receipts.ReceiptsActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilder {

    @ContributesAndroidInjector(modules = [HomeActivityModule::class])
    abstract fun bindHomeActivity(): HomeActivity

    @ContributesAndroidInjector(modules = [MLKitActivityModule::class])
    abstract fun bindMLKitActivity(): MLKitActivity

    @ContributesAndroidInjector(modules = [ReceiptsActivityModule::class])
    abstract fun bindReceiptsActivity(): ReceiptsActivity
}