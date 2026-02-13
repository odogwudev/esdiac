package com.example.esdiac.theme

import androidx.compose.material3.ColorScheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import com.example.esdiac.theme.EsdiacBase0
import com.example.esdiac.theme.EsdiacBase100
import com.example.esdiac.theme.EsdiacBase1000
import com.example.esdiac.theme.EsdiacBase1000Alpha14
import com.example.esdiac.theme.EsdiacBase1000Alpha8
import com.example.esdiac.theme.EsdiacBase1000Alpha80
import com.example.esdiac.theme.EsdiacBase100Alpha10
import com.example.esdiac.theme.EsdiacBase100Alpha10Alt
import com.example.esdiac.theme.EsdiacBase150
import com.example.esdiac.theme.EsdiacBase200
import com.example.esdiac.theme.EsdiacBase400
import com.example.esdiac.theme.EsdiacBase500
import com.example.esdiac.theme.EsdiacBase700
import com.example.esdiac.theme.EsdiacBase800
import com.example.esdiac.theme.EsdiacBase900
import com.example.esdiac.theme.EsdiacBase950
import com.example.esdiac.theme.EsdiacBlue
import com.example.esdiac.theme.EsdiacBrand100
import com.example.esdiac.theme.EsdiacBrand1000
import com.example.esdiac.theme.EsdiacBrand500
import com.example.esdiac.theme.EsdiacBrand500Alpha40
import com.example.esdiac.theme.EsdiacBrand600
import com.example.esdiac.theme.EsdiacBrand900
import com.example.esdiac.theme.EsdiacCakeDarkBlue
import com.example.esdiac.theme.EsdiacCakeDarkGreen
import com.example.esdiac.theme.EsdiacCakeDarkMint
import com.example.esdiac.theme.EsdiacCakeDarkOrange
import com.example.esdiac.theme.EsdiacCakeDarkPink
import com.example.esdiac.theme.EsdiacCakeDarkPurple
import com.example.esdiac.theme.EsdiacCakeDarkRed
import com.example.esdiac.theme.EsdiacCakeDarkTeal
import com.example.esdiac.theme.EsdiacCakeDarkViolet
import com.example.esdiac.theme.EsdiacCakeDarkYellow
import com.example.esdiac.theme.EsdiacCakeLightBlue
import com.example.esdiac.theme.EsdiacCakeLightGreen
import com.example.esdiac.theme.EsdiacCakeLightMint
import com.example.esdiac.theme.EsdiacCakeLightOrange
import com.example.esdiac.theme.EsdiacCakeLightPink
import com.example.esdiac.theme.EsdiacCakeLightPurple
import com.example.esdiac.theme.EsdiacCakeLightRed
import com.example.esdiac.theme.EsdiacCakeLightTeal
import com.example.esdiac.theme.EsdiacCakeLightViolet
import com.example.esdiac.theme.EsdiacCakeLightYellow
import com.example.esdiac.theme.EsdiacGreen
import com.example.esdiac.theme.EsdiacGrey
import com.example.esdiac.theme.EsdiacLightBlue
import com.example.esdiac.theme.EsdiacOrange
import com.example.esdiac.theme.EsdiacPink
import com.example.esdiac.theme.EsdiacPurple
import com.example.esdiac.theme.EsdiacRed200
import com.example.esdiac.theme.EsdiacRed500
import com.example.esdiac.theme.EsdiacRed600
import com.example.esdiac.theme.EsdiacTeal
import com.example.esdiac.theme.EsdiacViolet
import com.example.esdiac.theme.EsdiacYellow

val LocalExtendedColors = staticCompositionLocalOf { LightExtendedColors }

val ColorScheme.extended: ExtendedColors
    @ReadOnlyComposable
    @Composable
    get() = LocalExtendedColors.current

@Immutable
data class ExtendedColors(
    // Button states
    val primaryHover: Color,
    val destructiveHover: Color,
    val destructiveSecondaryOutline: Color,
    val disabledOutline: Color,
    val disabledFill: Color,
    val successOutline: Color,
    val success: Color,
    val onSuccess: Color,
    val secondaryFill: Color,

    // Text variants
    val textPrimary: Color,
    val textTertiary: Color,
    val textSecondary: Color,
    val textPlaceholder: Color,
    val textDisabled: Color,

    // Surface variants
    val surfaceLower: Color,
    val surfaceHigher: Color,
    val surfaceOutline: Color,
    val overlay: Color,

    // Accent colors
    val accentBlue: Color,
    val accentPurple: Color,
    val accentViolet: Color,
    val accentPink: Color,
    val accentOrange: Color,
    val accentYellow: Color,
    val accentGreen: Color,
    val accentTeal: Color,
    val accentLightBlue: Color,
    val accentGrey: Color,

    // Cake colors for chat bubbles
    val cakeViolet: Color,
    val cakeGreen: Color,
    val cakeBlue: Color,
    val cakePink: Color,
    val cakeOrange: Color,
    val cakeYellow: Color,
    val cakeTeal: Color,
    val cakePurple: Color,
    val cakeRed: Color,
    val cakeMint: Color,
)

val LightExtendedColors = ExtendedColors(
    primaryHover = EsdiacBrand600,
    destructiveHover = EsdiacRed600,
    destructiveSecondaryOutline = EsdiacRed200,
    disabledOutline = EsdiacBase200,
    disabledFill = EsdiacBase150,
    successOutline = EsdiacBrand100,
    success = EsdiacBrand600,
    onSuccess = EsdiacBase0,
    secondaryFill = EsdiacBase100,

    textPrimary = EsdiacBase1000,
    textTertiary = EsdiacBase800,
    textSecondary = EsdiacBase900,
    textPlaceholder = EsdiacBase700,
    textDisabled = EsdiacBase400,

    surfaceLower = EsdiacBase100,
    surfaceHigher = EsdiacBase100,
    surfaceOutline = EsdiacBase1000Alpha14,
    overlay = EsdiacBase1000Alpha80,

    accentBlue = EsdiacBlue,
    accentPurple = EsdiacPurple,
    accentViolet = EsdiacViolet,
    accentPink = EsdiacPink,
    accentOrange = EsdiacOrange,
    accentYellow = EsdiacYellow,
    accentGreen = EsdiacGreen,
    accentTeal = EsdiacTeal,
    accentLightBlue = EsdiacLightBlue,
    accentGrey = EsdiacGrey,

    cakeViolet = EsdiacCakeLightViolet,
    cakeGreen = EsdiacCakeLightGreen,
    cakeBlue = EsdiacCakeLightBlue,
    cakePink = EsdiacCakeLightPink,
    cakeOrange = EsdiacCakeLightOrange,
    cakeYellow = EsdiacCakeLightYellow,
    cakeTeal = EsdiacCakeLightTeal,
    cakePurple = EsdiacCakeLightPurple,
    cakeRed = EsdiacCakeLightRed,
    cakeMint = EsdiacCakeLightMint,
)

val DarkExtendedColors = ExtendedColors(
    primaryHover = EsdiacBrand600,
    destructiveHover = EsdiacRed600,
    destructiveSecondaryOutline = EsdiacRed200,
    disabledOutline = EsdiacBase900,
    disabledFill = EsdiacBase1000,
    successOutline = EsdiacBrand500Alpha40,
    success = EsdiacBrand500,
    onSuccess = EsdiacBase1000,
    secondaryFill = EsdiacBase900,

    textPrimary = EsdiacBase0,
    textTertiary = EsdiacBase200,
    textSecondary = EsdiacBase150,
    textPlaceholder = EsdiacBase400,
    textDisabled = EsdiacBase500,

    surfaceLower = EsdiacBase1000,
    surfaceHigher = EsdiacBase900,
    surfaceOutline = EsdiacBase100Alpha10Alt,
    overlay = EsdiacBase1000Alpha80,

    accentBlue = EsdiacBlue,
    accentPurple = EsdiacPurple,
    accentViolet = EsdiacViolet,
    accentPink = EsdiacPink,
    accentOrange = EsdiacOrange,
    accentYellow = EsdiacYellow,
    accentGreen = EsdiacGreen,
    accentTeal = EsdiacTeal,
    accentLightBlue = EsdiacLightBlue,
    accentGrey = EsdiacGrey,

    cakeViolet = EsdiacCakeDarkViolet,
    cakeGreen = EsdiacCakeDarkGreen,
    cakeBlue = EsdiacCakeDarkBlue,
    cakePink = EsdiacCakeDarkPink,
    cakeOrange = EsdiacCakeDarkOrange,
    cakeYellow = EsdiacCakeDarkYellow,
    cakeTeal = EsdiacCakeDarkTeal,
    cakePurple = EsdiacCakeDarkPurple,
    cakeRed = EsdiacCakeDarkRed,
    cakeMint = EsdiacCakeDarkMint,
)

val LightColorScheme = lightColorScheme(
    primary = EsdiacBrand500,
    onPrimary = EsdiacBrand1000,
    primaryContainer = EsdiacBrand100,
    onPrimaryContainer = EsdiacBrand900,

    secondary = EsdiacBase700,
    onSecondary = EsdiacBase0,
    secondaryContainer = EsdiacBase100,
    onSecondaryContainer = EsdiacBase900,

    tertiary = EsdiacBrand900,
    onTertiary = EsdiacBase0,
    tertiaryContainer = EsdiacBrand100,
    onTertiaryContainer = EsdiacBrand1000,

    error = EsdiacRed500,
    onError = EsdiacBase0,
    errorContainer = EsdiacRed200,
    onErrorContainer = EsdiacRed600,

    background = EsdiacBrand1000,
    onBackground = EsdiacBase0,
    surface = EsdiacBase0,
    onSurface = EsdiacBase1000,
    surfaceVariant = EsdiacBase100,
    onSurfaceVariant = EsdiacBase900,

    outline = EsdiacBase1000Alpha8,
    outlineVariant = EsdiacBase200,
)

val DarkColorScheme = darkColorScheme(
    primary = EsdiacBrand500,
    onPrimary = EsdiacBrand1000,
    primaryContainer = EsdiacBrand900,
    onPrimaryContainer = EsdiacBrand500,

    secondary = EsdiacBase400,
    onSecondary = EsdiacBase1000,
    secondaryContainer = EsdiacBase900,
    onSecondaryContainer = EsdiacBase150,

    tertiary = EsdiacBrand500,
    onTertiary = EsdiacBase1000,
    tertiaryContainer = EsdiacBrand900,
    onTertiaryContainer = EsdiacBrand500,

    error = EsdiacRed500,
    onError = EsdiacBase0,
    errorContainer = EsdiacRed600,
    onErrorContainer = EsdiacRed200,

    background = EsdiacBase1000,
    onBackground = EsdiacBase0,
    surface = EsdiacBase950,
    onSurface = EsdiacBase0,
    surfaceVariant = EsdiacBase900,
    onSurfaceVariant = EsdiacBase150,

    outline = EsdiacBase100Alpha10,
    outlineVariant = EsdiacBase800,
)