package org.hnisula.cpp2plugin

import com.intellij.model.Pointer
import com.intellij.model.Symbol
import com.intellij.navigation.NavigatableSymbol
import com.intellij.navigation.SymbolNavigationService
import com.intellij.openapi.project.Project
import com.intellij.platform.backend.navigation.NavigationTarget
import com.intellij.psi.PsiElement
import java.util.Objects

class Cpp2Symbol(private val identifier: String, private val element: PsiElement) : NavigatableSymbol {
    override fun createPointer(): Pointer<out Symbol> {
        return Pointer.hardPointer(this)
    }

    override fun getNavigationTargets(project: Project): MutableCollection<out NavigationTarget> {
        return mutableListOf(SymbolNavigationService.getInstance().psiElementNavigationTarget(element))
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || javaClass != other.javaClass) return false

        val otherSymbol = other as Cpp2Symbol
        return identifier == otherSymbol.identifier
    }

    override fun hashCode(): Int {
        return Objects.hash(identifier)
    }
}   