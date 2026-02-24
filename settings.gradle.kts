import dev.scaffoldit.hytale.wire.HytaleManifest
rootProject.name = "example"

plugins {
    id("dev.scaffoldit") version "0.2.+"
}
hytale {
    usePatchline("release")
    useVersion("latest")

    repositories {}

    dependencies {}

    manifest {
        Group = "Example"
        Name = "Example Mod"
        Version = "0.1.0"
        Description = "Example description"
        Authors = listOf(HytaleManifest.Author("Example Author", "Example Email", "https://example.com"))
        Website = "https://www.example.com"
        ServerVersion = "2026.02.19-1a311a592"
        IncludesAssetPack = true
        Main = "com.example.example.Example"
    }
}
