package com.lightteam.modpeide.ui.settings.fragments

import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import androidx.preference.Preference
import com.lightteam.modpeide.R
import com.lightteam.modpeide.data.storage.keyvalue.PreferenceHandler
import com.lightteam.modpeide.ui.base.fragments.DaggerPreferenceFragmentCompat
import com.lightteam.modpeide.utils.extensions.isUltimate

class EditorFragment : DaggerPreferenceFragmentCompat() {

    companion object {
        private const val KEY_FONT_TYPE = PreferenceHandler.KEY_FONT_TYPE
        private const val KEY_TAB_LIMIT = PreferenceHandler.KEY_TAB_LIMIT
    }

    private lateinit var navController: NavController

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.preference_editor, rootKey)

        navController = findNavController()
        val isUltimate = requireContext().isUltimate()
        findPreference<Preference>(KEY_TAB_LIMIT)?.isEnabled = isUltimate
        findPreference<Preference>(KEY_FONT_TYPE)?.setOnPreferenceClickListener {
            navController.navigate(R.id.fontsFragment)
            true
        }
    }
}