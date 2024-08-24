package org.hnisula.cpp2plugin.psi

import com.intellij.psi.PsiElement
import org.hnisula.cpp2plugin.Cpp2SymbolDeclaration

class Cpp2ResolverUtil {
    companion object {
        private fun findIdentifierDeclInScope(identifier: String, scope: PsiElement): PsiElement? { // TODO: Have a scope element class?
            val decls = Cpp2PsiUtil.getDeclsInScope(scope)

            for (decl in decls) {
                if (decl.identifier == identifier) {
                    return decl.declaringElement
                }
            }

             return null
        }

        // TODO: Rename to "...InRootScope"?
        fun findQualifiedIdentifierDeclInScope(identifiers: Collection<String>, scope: PsiElement): Cpp2SymbolDeclaration? {
            var currentScope: PsiElement? = scope

            for (identifier in identifiers) {
                if (currentScope == null) {
                    return null
                }

                currentScope = findIdentifierDeclInScope(identifier, currentScope)
            }
            
            return null
//            return if (currentScope is Cpp2SymbolDeclaration) {
//                currentScope
//            } else {
//                null
//            }
        }
    }
}