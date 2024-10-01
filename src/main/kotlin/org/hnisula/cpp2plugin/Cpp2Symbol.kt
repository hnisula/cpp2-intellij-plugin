package org.hnisula.cpp2plugin

import com.intellij.navigation.NavigatableSymbol
import com.intellij.psi.NavigatablePsiElement
import com.intellij.psi.PsiNamedElement

interface Cpp2Symbol : Cpp2Declaration, PsiNamedElement, NavigatableSymbol