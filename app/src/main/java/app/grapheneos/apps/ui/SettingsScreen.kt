package app.grapheneos.apps.ui

import android.os.Bundle
import android.view.View
import app.grapheneos.apps.R
import app.grapheneos.apps.core.appResources
import com.android.settingslib.preference.PreferenceFragment

class SettingsScreen : PreferenceFragment() {

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        preferenceManager.sharedPreferencesName = appResources.getString(R.string.pref_file_settings)
        addPreferencesFromResource(R.xml.settings)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupSlideTransitions(this)
    }
}
