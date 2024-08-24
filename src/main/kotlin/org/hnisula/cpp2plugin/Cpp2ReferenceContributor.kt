package org.hnisula.cpp2plugin//package org.hnisula.cpp2plugin
//
//import com.intellij.patterns.PlatformPatterns
//import com.intellij.patterns.PsiElementPattern
//import com.intellij.psi.*
//import com.intellij.util.ProcessingContext
//
//final class Cpp2ReferenceContributor : PsiReferenceContributor() {
//    override fun registerReferenceProviders(registrar: PsiReferenceRegistrar) {
//        registrar.registerReferenceProvider(
//            PlatformPatterns.psiElement(Cpp2Lvalue::class.java), Cpp2LvalueReferenceProvider()
//        )
//    }
//}
//
//class Cpp2LvalueReferenceProvider : PsiReferenceProvider() {
//    override fun getReferencesByElement(element: PsiElement, context: ProcessingContext): Array<PsiReference> {
//        val lvalue = element as? Cpp2Lvalue ?: return emptyArray()
//        lvalue
//    }
//}