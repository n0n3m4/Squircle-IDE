/*
 * Licensed to the Light Team Software (Light Team) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The Light Team licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.lightteam.modpeide.utils.commons

import android.content.Context
import android.graphics.Typeface
import com.lightteam.modpeide.utils.extensions.getTypefaceFromAssets

object TypefaceFactory {

    const val FIRA_CODE = "fira_code"
    const val SOURCE_CODE_PRO = "source_code_pro"
    const val ANONYMOUS_PRO = "anonymous_pro"
    const val JETBRAINS_MONO = "jetbrains_mono"
    const val DROID_SANS_MONO = "droid_sans_mono"
    const val DEJAVU_SANS_MONO = "dejavu_sans_mono"

    private const val PATH_FIRA_CODE = "fonts/fira_code.ttf"
    private const val PATH_SOURCE_CODE_PRO = "fonts/source_code_pro.ttf"
    private const val PATH_ANONYMOUS_PRO = "fonts/anonymous_pro.ttf"
    private const val PATH_JETBRAINS_MONO = "fonts/jetbrains_mono.ttf"
    //private const val PATH_DROID_SANS_MONO = "fonts/droid_sans_mono.ttf"
    private const val PATH_DEJAVU_SANS_MONO = "fonts/dejavu_sans_mono.ttf"

    fun create(context: Context, name: String): Typeface {
        return when (name) {
            FIRA_CODE -> context.getTypefaceFromAssets(PATH_FIRA_CODE)
            SOURCE_CODE_PRO -> context.getTypefaceFromAssets(PATH_SOURCE_CODE_PRO)
            ANONYMOUS_PRO -> context.getTypefaceFromAssets(PATH_ANONYMOUS_PRO)
            JETBRAINS_MONO -> context.getTypefaceFromAssets(PATH_JETBRAINS_MONO)
            DROID_SANS_MONO -> Typeface.MONOSPACE // Droid Sans Mono
            DEJAVU_SANS_MONO -> context.getTypefaceFromAssets(PATH_DEJAVU_SANS_MONO)
            else -> create(context, JETBRAINS_MONO)
        }
    }
}