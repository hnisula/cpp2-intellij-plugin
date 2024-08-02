package org.hannesnisula.cpp2plugin.psi

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.lang.ASTNode

abstract class Cpp2NamedElementImpl(node: ASTNode) : ASTWrapperPsiElement(node), Cpp2NamedElement {}