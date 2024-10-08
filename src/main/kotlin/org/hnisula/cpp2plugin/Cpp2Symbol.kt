package org.hnisula.cpp2plugin

import com.intellij.model.Pointer
import com.intellij.model.Symbol
import com.intellij.navigation.NavigatableSymbol
import com.intellij.openapi.project.Project
import com.intellij.platform.backend.navigation.NavigationTarget
import com.intellij.psi.PsiElement
import org.hnisula.cpp2plugin.psi.Cpp2PsiUtil
import java.util.*

class Cpp2Symbol(val name: String, val scope: Collection<String>, val element: PsiElement) : NavigatableSymbol {
    override fun createPointer(): Pointer<out Symbol> {
        return Pointer.hardPointer(this)
    }

    override fun getNavigationTargets(project: Project): MutableCollection<out NavigationTarget> {
        return Cpp2PsiUtil.getNavigationTargets(element, project)
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || javaClass != other.javaClass) return false

        val otherSymbol = other as Cpp2Symbol
        return name == otherSymbol.name
    }

    override fun hashCode(): Int {
        return Objects.hash(name, scope)
    }
}